package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultipleStopKt {
    private static ImageVector _multipleStop;

    public static final ImageVector getMultipleStop(Icons.TwoTone twoTone) {
        ImageVector imageVector = _multipleStop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MultipleStop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 4.0f, 4.0f, 4.0f);
        fc.u(e, -4.0f, 4.0f, 9.0f, -4.0f);
        c21.c(e, 7.0f, 4.0f, 4.0f);
        e.moveTo(10.0f, 7.0f);
        e.curveTo(9.45f, 7.0f, 9.0f, 7.45f, 9.0f, 8.0f);
        e.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        e.reflectiveCurveTo(10.55f, 7.0f, 10.0f, 7.0f);
        e.close();
        e.moveTo(6.0f, 7.0f);
        e.curveTo(5.45f, 7.0f, 5.0f, 7.45f, 5.0f, 8.0f);
        e.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        e.reflectiveCurveTo(6.55f, 7.0f, 6.0f, 7.0f);
        r6.B(e, 7.0f, 17.0f, 4.0f, -2.0f);
        k4.q(e, 7.0f, -3.0f, -4.0f, 4.0f);
        uf.x(e, 4.0f, 4.0f, 17.0f);
        e.moveTo(14.0f, 17.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        e.curveTo(13.0f, 16.55f, 13.45f, 17.0f, 14.0f, 17.0f);
        e.close();
        e.moveTo(18.0f, 17.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        e.curveTo(17.0f, 16.55f, 17.45f, 17.0f, 18.0f, 17.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _multipleStop = build;
        build.getClass();
        return build;
    }
}
