package androidx.compose.material.icons.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotionPhotosPauseKt {
    private static ImageVector _motionPhotosPause;

    public static final ImageVector getMotionPhotosPause(Icons.Filled filled) {
        ImageVector imageVector = _motionPhotosPause;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MotionPhotosPause", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(2.88f, 7.88f, 1.54f, 1.54f);
        e.curveTo(4.15f, 10.23f, 4.0f, 11.1f, 4.0f, 12.0f);
        e.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        e.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        e.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        e.curveToRelative(-0.9f, 0.0f, -1.77f, 0.15f, -2.58f, 0.42f);
        e.lineTo(7.89f, 2.89f);
        e.curveTo(9.15f, 2.32f, 10.54f, 2.0f, 12.0f, 2.0f);
        e.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        e.reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f);
        e.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        e.curveTo(2.0f, 10.53f, 2.32f, 9.14f, 2.88f, 7.88f);
        e.close();
        e.moveTo(7.0f, 5.5f);
        e.curveTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f);
        e.reflectiveCurveTo(4.0f, 6.33f, 4.0f, 5.5f);
        e.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        e.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        e.close();
        e.moveTo(12.0f, 6.0f);
        e.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        e.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        e.reflectiveCurveTo(15.31f, 6.0f, 12.0f, 6.0f);
        c21.d(e, 11.0f, 15.0f, 9.0f, 9.0f);
        uo.r(e, 2.0f, 15.0f, 15.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(e, -2.0f, 9.0f, 2.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosPause = build;
        build.getClass();
        return build;
    }
}
