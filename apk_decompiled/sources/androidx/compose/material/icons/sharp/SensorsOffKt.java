package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SensorsOffKt {
    private static ImageVector _sensorsOff;

    public static final ImageVector getSensorsOff(Icons.Sharp sharp) {
        ImageVector imageVector = _sensorsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SensorsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.14f, 10.96f);
        b.curveTo(8.05f, 11.29f, 8.0f, 11.64f, 8.0f, 12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f);
        b.curveToRelative(0.0f, -0.93f, 0.21f, -1.8f, 0.58f, -2.59f);
        b.lineTo(5.11f, 7.94f);
        b.curveTo(4.4f, 9.13f, 4.0f, 10.52f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 2.21f, 0.9f, 4.21f, 2.35f, 5.65f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(3.12f, 17.26f, 2.0f, 14.76f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(18.38f, 18.38f);
        gy.B(b, -1.41f, 1.41f, 8.14f, 10.96f);
        b.moveTo(17.42f, 14.59f);
        b.curveTo(17.79f, 13.8f, 18.0f, 12.93f, 18.0f, 12.0f);
        b.curveToRelative(0.0f, -1.66f, -0.67f, -3.16f, -1.76f, -4.24f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
        b.curveToRelative(0.0f, 0.36f, -0.05f, 0.71f, -0.14f, 1.04f);
        uo.l(b, 17.42f, 14.59f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, 1.48f, -0.4f, 2.87f, -1.11f, 4.06f);
        b.lineToRelative(1.45f, 1.45f);
        b.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensorsOff = build;
        build.getClass();
        return build;
    }
}
