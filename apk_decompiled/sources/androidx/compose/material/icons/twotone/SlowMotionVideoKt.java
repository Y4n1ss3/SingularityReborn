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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlowMotionVideoKt {
    private static ImageVector _slowMotionVideo;

    public static final ImageVector getSlowMotionVideo(Icons.TwoTone twoTone) {
        ImageVector imageVector = _slowMotionVideo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SlowMotionVideo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.26f, 18.32f, 1.43f, -1.43f);
        e.curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f);
        e.lineTo(2.05f, 13.0f);
        e.curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f);
        e.close();
        e.moveTo(7.1f, 5.69f);
        e.curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f);
        e.lineTo(11.0f, 2.05f);
        e.curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f);
        uo.l(e, 7.1f, 5.69f, 2.05f, 11.0f);
        e.horizontalLineToRelative(2.02f);
        e.curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f);
        e.lineTo(4.26f, 5.68f);
        e.curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f);
        bv.v(e, 13.05f, 2.05f, 2.02f);
        e.curveTo(16.97f, 4.59f, 20.0f, 7.95f, 20.0f, 12.0f);
        e.reflectiveCurveToRelative(-3.03f, 7.41f, -6.95f, 7.93f);
        e.verticalLineToRelative(2.02f);
        e.curveTo(18.08f, 21.42f, 22.0f, 17.16f, 22.0f, 12.0f);
        e.curveToRelative(0.0f, -5.16f, -3.92f, -9.42f, -8.95f, -9.95f);
        k4.x(e, 16.0f, 12.0f, -2.95f, -2.21f);
        e.lineTo(10.0f, 7.5f);
        uo.t(e, 9.0f, 3.05f, -2.29f);
        e.moveTo(5.68f, 19.74f);
        e.curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f);
        e.verticalLineToRelative(-2.02f);
        e.curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(e, -1.42f, 1.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _slowMotionVideo = build;
        build.getClass();
        return build;
    }
}
