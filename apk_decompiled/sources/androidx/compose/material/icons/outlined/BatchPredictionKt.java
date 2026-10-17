package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BatchPredictionKt {
    private static ImageVector _batchPrediction;

    public static final ImageVector getBatchPrediction(Icons.Outlined outlined) {
        ImageVector imageVector = _batchPrediction;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BatchPrediction", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.0f, 8.0f, 7.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        d.verticalLineToRelative(10.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(10.0f);
        d.curveTo(19.0f, 8.9f, 18.1f, 8.0f, 17.0f, 8.0f);
        af0.r(d, 13.0f, 20.5f, -2.0f, 19.0f);
        uo.r(d, 2.0f, 20.5f, 13.0f, 18.0f);
        d.horizontalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        d.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        d.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        d.curveTo(15.5f, 15.0f, 13.0f, 16.5f, 13.0f, 18.0f);
        uo.q(d, 18.0f, 6.5f, 6.0f, 0.0f);
        d.curveTo(6.0f, 5.67f, 6.67f, 5.0f, 7.5f, 5.0f);
        d.horizontalLineToRelative(9.0f);
        d.curveTo(17.33f, 5.0f, 18.0f, 5.67f, 18.0f, 6.5f);
        uo.l(d, 18.0f, 6.5f, 17.0f, 3.5f);
        d.horizontalLineTo(7.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(7.0f, 2.67f, 7.67f, 2.0f, 8.5f, 2.0f);
        d.horizontalLineToRelative(7.0f);
        d.curveTo(16.33f, 2.0f, 17.0f, 2.67f, 17.0f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 17.0f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batchPrediction = build;
        build.getClass();
        return build;
    }
}
