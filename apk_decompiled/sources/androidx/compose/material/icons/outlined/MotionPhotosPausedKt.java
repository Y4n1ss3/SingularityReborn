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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotionPhotosPausedKt {
    private static ImageVector _motionPhotosPaused;

    public static final ImageVector getMotionPhotosPaused(Icons.Outlined outlined) {
        ImageVector imageVector = _motionPhotosPaused;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MotionPhotosPaused", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        b.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, -1.19f, 0.22f, -2.32f, 0.6f, -3.38f);
        b.lineTo(4.48f, 9.3f);
        b.curveTo(4.17f, 10.14f, 4.0f, 11.05f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        b.curveToRelative(-0.95f, 0.0f, -1.85f, 0.17f, -2.69f, 0.48f);
        b.lineTo(8.63f, 2.59f);
        b.curveTo(9.69f, 2.22f, 10.82f, 2.0f, 12.0f, 2.0f);
        b.curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f);
        b.close();
        b.moveTo(5.5f, 4.0f);
        b.curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f);
        b.reflectiveCurveTo(4.67f, 7.0f, 5.5f, 7.0f);
        b.reflectiveCurveTo(7.0f, 6.33f, 7.0f, 5.5f);
        b.reflectiveCurveTo(6.33f, 4.0f, 5.5f, 4.0f);
        uo.A(b, 11.0f, 16.0f, 8.0f, 9.0f);
        kf0.n(b, 8.0f, 11.0f, 15.0f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.p(b, 8.0f, -2.0f, 8.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosPaused = build;
        build.getClass();
        return build;
    }
}
