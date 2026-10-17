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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SummarizeKt {
    private static ImageVector _summarize;

    public static final ImageVector getSummarize(Icons.Outlined outlined) {
        ImageVector imageVector = _summarize;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Summarize", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(15.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.01f, 3.9f, 3.01f, 5.0f);
        d.lineTo(3.0f, 19.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        d.horizontalLineTo(19.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 9.0f, 15.0f, 3.0f);
        kp0.t(d, 5.0f, 19.0f, 5.0f, 9.0f);
        fc.y(d, 5.0f, 5.0f, 9.0f, 5.0f);
        d.moveTo(9.0f, 8.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveTo(7.0f, 8.55f, 7.0f, 8.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveTo(9.0f, 7.45f, 9.0f, 8.0f);
        d.close();
        d.moveTo(9.0f, 12.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveTo(9.0f, 11.45f, 9.0f, 12.0f);
        d.close();
        d.moveTo(9.0f, 16.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 9.0f, 15.45f, 9.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _summarize = build;
        build.getClass();
        return build;
    }
}
