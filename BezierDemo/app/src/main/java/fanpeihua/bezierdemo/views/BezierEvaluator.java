package fanpeihua.bezierdemo.views;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

import fanpeihua.bezierdemo.util.BezierUtil;

/**
 * Created by oneball on 2017/9/13.
 */

public class BezierEvaluator implements TypeEvaluator<PointF> {
    private PointF mFlagPoint;

    public BezierEvaluator(PointF flagPoint) {
        mFlagPoint = flagPoint;
    }

    @Override
    public PointF evaluate(float v, PointF pointF, PointF f) {
        return BezierUtil.CalculateBezierPointForQuadratic(v, pointF, mFlagPoint, f);
    }
}
