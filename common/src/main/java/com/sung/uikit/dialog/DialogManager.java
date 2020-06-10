package com.sung.uikit.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sung.common.R;
import com.sung.common.adapter.CoinTypeAdapter;
import com.sung.common.bean.OrderBean;
import com.sung.common.bean.QuotationBean;
import com.sung.common.bean.request.SetStopRequest;
import com.sung.common.utils.StringUtils;
import com.sung.uikit.widget.MaxRecyclerview;

import java.util.List;

import javax.security.auth.callback.Callback;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Create by sung at 2020-04-03
 *
 * @desc: 弹窗管理类
 * @notice: 统一弹窗入口
 */
public class DialogManager {

    /**
     * 展示简单文案提示弹窗
     *
     * @param context
     * @param tips     文案
     * @param listener
     * @return dialog
     * @author sung at 2020-04-04
     * @notice 无点击监听
     */
    public static CustomDialog openSimpleTipDialog(Context context, String tips, IPositiveClickListener listener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(tips)
                .positive(context.getResources().getString(R.string.dialog_know))
                .addPositiveListener(listener)
                .negitiveGone()
                .creat();
    }

    /**
     * 展示简单文案供选择的提示弹窗
     *
     * @param context
     * @param tips        文案
     * @param posListener
     * @param negListener
     * @return dialog
     * @author sung at 2020-04-04
     * @notice 监听
     */
    public static CustomDialog openSimpleChooseTipDialog(Context context, String tips, IPositiveClickListener posListener, INegitiveClickListener negListener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(tips)
                .negitive(context.getResources().getString(R.string.dialog_cancel))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .addPositiveListener(posListener)
                .addNegitiveListener(negListener)
                .creat();
    }

    /**
     * 退出应用弹窗
     *
     * @param context
     * @param loginoutListener 退出监听
     * @return dialog
     * @author sung at 2020-04-04
     * @notice
     */
    public static CustomDialog openLoginoutDialog(Context context, IPositiveClickListener<CustomDialog> loginoutListener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(context.getResources().getString(R.string.dialog_loginout_tips))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .negitive(context.getResources().getString(R.string.dialog_wrong))
                .addPositiveListener(loginoutListener)
                .addNegitiveListener(new INegitiveClickListener<CustomDialog>() {
                    @Override
                    public void onNegitive(CustomDialog customDialog) {
                        customDialog.dismiss();
                    }
                })
                .creat();
    }

    /**
     * 自定义展示内容弹窗(订单二次确认)
     *
     * @param context
     * @param posListener
     * @param negListener
     * @return dialog
     * @author sung at 2020-05-13
     * @notice 添加自定义展示内容
     */
    public static CustomDialog openOrderDialog(Context context, OrderBean orderBean, IPositiveClickListener<CustomDialog> posListener, INegitiveClickListener<CustomDialog> negListener) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_order_dialog, null, false);
        TextView title = view.findViewById(R.id.tv_order_title);
        TextView type = view.findViewById(R.id.tv_order_type);
        TextView hand = view.findViewById(R.id.tv_order_hand);
        TextView mutiple = view.findViewById(R.id.tv_order_mutiple);
        TextView safe = view.findViewById(R.id.tv_order_safe);
        TextView service = view.findViewById(R.id.tv_order_service);
        title.setText(orderBean.mCoinName);
        type.setText(orderBean.mTypeName);
        hand.setText(orderBean.mhands);
        mutiple.setText(orderBean.mMutiple);
        safe.setText(orderBean.mSafeValue);
        service.setText(orderBean.mServiceValue);
        return new DialogBuilder(context)
                .title(context.getResources().getString(R.string.dialog_order))
                .customView(view)
                .negitive(context.getResources().getString(R.string.dialog_cancel))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .addPositiveListener(posListener)
                .addNegitiveListener(negListener)
                .creat();
    }

    /**
     * 自定义展示内容弹窗(设置盈亏二次确认)
     *
     * @return dialog
     * @author sung at 2020-05-13
     * @notice 添加自定义展示内容
     */
    private static double earnValue = 0.00d;
    private static double lostValue = 0.00d;

    public static CustomDialog openEarnAndLostDialog(final Context context, final String id, double open, final CallBack<SetStopRequest> posListener) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_order_set_earn_lost, null, false);
        TextView earnDown = view.findViewById(R.id.tv_remove_1);
        final EditText earn = view.findViewById(R.id.et_num_1);
        TextView earnUp = view.findViewById(R.id.tv_add_1);
        final TextView valueEarn = view.findViewById(R.id.tv_value_1);
        final TextView valueLost = view.findViewById(R.id.tv_value_2);
        valueEarn.setText(context.getResources().getString(R.string.dialog_order_may_earn) + StringUtils.formatNumber(earnValue));
        valueLost.setText(context.getResources().getString(R.string.dialog_order_may_lost) + StringUtils.formatNumber(lostValue));

        earn.setText(String.valueOf(open));
        earnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String value = earn.getText().toString();
                    double d = Double.parseDouble(value) - 0.01d;
                    earnValue = earnValue - 0.1d;
                    valueEarn.setText(context.getResources().getString(R.string.dialog_order_may_earn) + StringUtils.formatNumber(earnValue));
                    valueEarn.setVisibility(View.VISIBLE);
                    earn.setText(StringUtils.formatNumber(d));
                } catch (Exception e) {
                    Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                }
            }
        });
        earnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String value = earn.getText().toString();
                    double d = Double.parseDouble(value) + 0.01d;
                    earnValue = earnValue + 0.1d;
                    valueEarn.setText(context.getResources().getString(R.string.dialog_order_may_earn) + StringUtils.formatNumber(earnValue));
                    earn.setText(StringUtils.formatNumber(d));
                } catch (Exception e) {
                    Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView lostDown = view.findViewById(R.id.tv_remove_2);
        final EditText lost = view.findViewById(R.id.et_num_2);
        TextView lostUp = view.findViewById(R.id.tv_add_2);

        lost.setText(String.valueOf(open));
        lostDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String value = lost.getText().toString();
                    double d = Double.parseDouble(value) - 0.01d;
                    lostValue = lostValue - 0.1d;
                    valueLost.setText(context.getResources().getString(R.string.dialog_order_may_lost) + StringUtils.formatNumber(lostValue));
                    valueLost.setVisibility(View.VISIBLE);
                    lost.setText(StringUtils.formatNumber(d));
                } catch (Exception e) {
                    Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                }
            }
        });
        lostUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String value = lost.getText().toString();
                    double d = Double.parseDouble(value) + 0.01d;
                    lostValue = lostValue + 0.1d;
                    valueLost.setText(context.getResources().getString(R.string.dialog_order_may_lost) + StringUtils.formatNumber(lostValue));
                    valueLost.setVisibility(View.VISIBLE);
                    lost.setText(StringUtils.formatNumber(d));
                } catch (Exception e) {
                    Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                }
            }
        });

        CustomDialog dialog = new DialogBuilder(context)
                .title(context.getResources().getString(R.string.dialog_order_set_earnlost))
                .customView(view)
                .negitive(context.getResources().getString(R.string.dialog_cancel))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .widthPercent(0.9)
                .addPositiveListener(new IPositiveClickListener() {
                    @Override
                    public void onPositive(BaseDialog baseDialog) {
                        try {
                            SetStopRequest request = new SetStopRequest(id, earn.getText().toString(), lost.getText().toString());
                            posListener.onSubmit(request);
                            baseDialog.dismiss();
                        } catch (Exception e) {
                            Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addNegitiveListener(new INegitiveClickListener() {
                    @Override
                    public void onNegitive(BaseDialog baseDialog) {
                        baseDialog.dismiss();
                    }
                })
                .creat();
        return dialog;
    }

    public interface CallBack<T> {
        void onSubmit(T t);
    }

    public static CustomDialog openOrderEqualDialog(final Context context, final CallBack<Integer> callback) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_order_onkey_equal, null, false);
        final TextView equalAll = view.findViewById(R.id.tv_contract_order_equal_all);
        final TextView equalMutil = view.findViewById(R.id.tv_contract_order_equal_mutil);
        final TextView equalEmpty = view.findViewById(R.id.tv_contract_order_equal_empty);
        equalAll.setSelected(true);
        equalMutil.setSelected(false);
        equalEmpty.setSelected(false);
        final int whiteColor = context.getResources().getColor(android.R.color.white);
        final int themeColor = context.getResources().getColor(R.color.theme_color);
        final int greenColor = context.getResources().getColor(R.color.theme_green);
        final int redColor = context.getResources().getColor(R.color.theme_red);
        equalAll.setTextColor(whiteColor);
        equalMutil.setTextColor(greenColor);
        equalEmpty.setTextColor(redColor);
        equalAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalAll.setSelected(true);
                equalMutil.setSelected(false);
                equalEmpty.setSelected(false);
                equalAll.setTextColor(whiteColor);
                equalMutil.setTextColor(greenColor);
                equalEmpty.setTextColor(redColor);
            }
        });
        equalMutil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalAll.setSelected(false);
                equalMutil.setSelected(true);
                equalEmpty.setSelected(false);
                equalAll.setTextColor(themeColor);
                equalMutil.setTextColor(whiteColor);
                equalEmpty.setTextColor(redColor);
            }
        });
        equalEmpty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalAll.setSelected(false);
                equalMutil.setSelected(false);
                equalEmpty.setSelected(true);
                equalAll.setTextColor(themeColor);
                equalMutil.setTextColor(greenColor);
                equalEmpty.setTextColor(whiteColor);
            }
        });
        CustomDialog dialog = new DialogBuilder(context)
                .title(context.getResources().getString(R.string.dialog_order_equal_tips))
                .customView(view)
                .negitive(context.getResources().getString(R.string.dialog_cancel))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .addPositiveListener(new IPositiveClickListener() {
                    @Override
                    public void onPositive(BaseDialog baseDialog) {
                        try {
                            int type = 0;
                            if (equalAll.isSelected()) {
                                type = 0;
                            } else if (equalMutil.isSelected()) {
                                type = 1;
                            } else if (equalEmpty.isSelected()) {
                                type = 2;
                            } else {
                                Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                                return;
                            }
                            callback.onSubmit(type);
                            baseDialog.dismiss();
                        } catch (Exception e) {
                            Toast.makeText(context, context.getResources().getString(R.string.app_oprate_failed), Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addNegitiveListener(new INegitiveClickListener() {
                    @Override
                    public void onNegitive(BaseDialog baseDialog) {
                        baseDialog.dismiss();
                    }
                })
                .creat();
        return dialog;
    }

    public static CustomDialog openChoosePriceTypeDialog(Context context, final CallBack<Integer> callBack) {
        final View view = LayoutInflater.from(context).inflate(R.layout.layout_order_choose_price_type, null, false);
        final CustomDialog dialog = new DialogBuilder(context)
                .titleGone()
                .customView(view)
                .positiveGone()
                .negitiveGone()
                .creat();
        View market = view.findViewById(R.id.tv_market_price);
        View fixed = view.findViewById(R.id.tv_fixed_price);
        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.onSubmit(0);
                dialog.dismiss();
            }
        });
        fixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.onSubmit(1);
                dialog.dismiss();
            }
        });
        return dialog;
    }

    public static CustomDialog openChooseCoinTypeDialog(final Context context, List<String> coins, final CallBack<Integer> callBack) {
        final View view = LayoutInflater.from(context).inflate(R.layout.layout_order_choose_coin_type, null, false);

        final CustomDialog dialog = new DialogBuilder(context)
                .titleGone()
                .customView(view)
                .positiveGone()
                .negitiveGone()
                .creat();

        MaxRecyclerview list = view.findViewById(R.id.rv_coin_type);
        View reload = view.findViewById(R.id.tv_coin_reload);

        list.setLayoutManager(new LinearLayoutManager(context));
        list.setItemAnimator(new DefaultItemAnimator());
        list.setHasFixedSize(true);
        CoinTypeAdapter adapter = new CoinTypeAdapter(coins);
        list.setAdapter(adapter);
        adapter.addOnItemClickListener(new CoinTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                callBack.onSubmit(position);
                dialog.dismiss();
            }
        });

//        reload.setVisibility(coins.isEmpty() ? View.VISIBLE : View.GONE);
//        reload.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, context.getResources().getString(R.string.app_oprate_succ), Toast.LENGTH_SHORT).show();
//                dialog.dismiss();
//            }
//        });
        return dialog;
    }

    /**
     * 自定义展示内容弹窗
     *
     * @param context
     * @param customContent
     * @param title
     * @param negitive
     * @param positive
     * @param posListener
     * @param negListener
     * @return dialog
     * @author sung at 2020-05-13
     * @notice 添加自定义展示内容
     */
    public static CustomDialog openCustomContnetDialog(Context context, View customContent, String title, String negitive, String positive,
                                                       IPositiveClickListener<CustomDialog> posListener, INegitiveClickListener<CustomDialog> negListener) {
        return new DialogBuilder(context)
                .title(title)
                .customView(customContent)
                .negitive(TextUtils.isEmpty(negitive) ? context.getResources().getString(R.string.dialog_cancel) : negitive)
                .positive(TextUtils.isEmpty(positive) ? context.getResources().getString(R.string.dialog_ok) : positive)
                .addPositiveListener(posListener)
                .addNegitiveListener(negListener)
                .creat();
    }
}
