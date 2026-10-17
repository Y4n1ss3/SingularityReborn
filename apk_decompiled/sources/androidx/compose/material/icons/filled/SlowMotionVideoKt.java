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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlowMotionVideoKt {
    private static ImageVector _slowMotionVideo;

    public static final ImageVector getSlowMotionVideo(Icons.Filled filled) {
        ImageVector imageVector = _slowMotionVideo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SlowMotionVideo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(13.05f, 9.79f, 10.0f, 7.5f, 9.0f);
        gy.B(s, 3.05f, -2.29f, 16.0f, 12.0f);
        s.moveTo(13.05f, 9.79f);
        s.lineTo(10.0f, 7.5f);
        s.verticalLineToRelative(9.0f);
        gy.B(s, 3.05f, -2.29f, 16.0f, 12.0f);
        s.moveTo(13.05f, 9.79f);
        s.lineTo(10.0f, 7.5f);
        s.verticalLineToRelative(9.0f);
        gy.B(s, 3.05f, -2.29f, 16.0f, 12.0f);
        s.moveTo(11.0f, 4.07f);
        s.lineTo(11.0f, 2.05f);
        s.curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f);
        s.lineTo(7.1f, 5.69f);
        s.curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f);
        k4.r(s, 5.69f, 7.1f, 4.26f, 5.68f);
        s.curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f);
        s.horizontalLineToRelative(2.02f);
        s.curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f);
        k4.r(s, 4.07f, 13.0f, 2.05f, 13.0f);
        s.curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f);
        s.lineToRelative(1.43f, -1.43f);
        s.curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f);
        s.close();
        s.moveTo(5.68f, 19.74f);
        s.curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f);
        s.verticalLineToRelative(-2.02f);
        s.curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f);
        fc.B(s, -1.42f, 1.43f, 22.0f, 12.0f);
        s.curveToRelative(0.0f, 5.16f, -3.92f, 9.42f, -8.95f, 9.95f);
        s.verticalLineToRelative(-2.02f);
        s.curveTo(16.97f, 19.41f, 20.0f, 16.05f, 20.0f, 12.0f);
        s.reflectiveCurveToRelative(-3.03f, -7.41f, -6.95f, -7.93f);
        s.lineTo(13.05f, 2.05f);
        s.curveTo(18.08f, 2.58f, 22.0f, 6.84f, 22.0f, 12.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _slowMotionVideo = build;
        build.getClass();
        return build;
    }
}
