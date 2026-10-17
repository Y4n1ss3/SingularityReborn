package androidx.compose.material.icons.rounded;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrightnessAutoKt {
    private static ImageVector _brightnessAuto;

    public static final ImageVector getBrightnessAuto(Icons.Rounded rounded) {
        ImageVector imageVector = _brightnessAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrightnessAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(10.85f, 12.65f, 2.3f, 12.0f, 9.0f);
        fc.B(p, -1.15f, 3.65f, 20.0f, 8.69f);
        p.lineTo(20.0f, 6.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.horizontalLineToRelative(-2.69f);
        p.lineToRelative(-1.9f, -1.9f);
        p.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        p.lineTo(8.69f, 4.0f);
        p.lineTo(6.0f, 4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(2.69f);
        p.lineToRelative(-1.9f, 1.9f);
        p.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        p.lineToRelative(1.9f, 1.9f);
        p.lineTo(4.0f, 18.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(2.69f);
        p.lineToRelative(1.9f, 1.9f);
        p.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        p.lineToRelative(1.9f, -1.9f);
        p.lineTo(18.0f, 20.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.verticalLineToRelative(-2.69f);
        p.lineToRelative(1.9f, -1.9f);
        p.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        uo.l(p, 20.0f, 8.69f, 14.09f, 15.4f);
        p.lineTo(13.6f, 14.0f);
        p.horizontalLineToRelative(-3.2f);
        p.lineToRelative(-0.49f, 1.4f);
        p.curveToRelative(-0.13f, 0.36f, -0.46f, 0.6f, -0.84f, 0.6f);
        p.curveToRelative(-0.62f, 0.0f, -1.05f, -0.61f, -0.84f, -1.19f);
        p.lineToRelative(2.44f, -6.86f);
        p.curveToRelative(0.2f, -0.57f, 0.73f, -0.95f, 1.33f, -0.95f);
        p.curveToRelative(0.6f, 0.0f, 1.13f, 0.38f, 1.34f, 0.94f);
        p.lineToRelative(2.44f, 6.86f);
        p.curveToRelative(0.21f, 0.58f, -0.22f, 1.19f, -0.84f, 1.19f);
        p.curveToRelative(-0.39f, 0.01f, -0.72f, -0.23f, -0.85f, -0.59f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessAuto = build;
        build.getClass();
        return build;
    }
}
