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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlashAutoKt {
    private static ImageVector _flashAuto;

    public static final ImageVector getFlashAuto(Icons.Rounded rounded) {
        ImageVector imageVector = _flashAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlashAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(3.0f, 3.0f, 10.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(2.0f);
        h.verticalLineToRelative(7.15f);
        h.curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f);
        h.lineToRelative(5.19f, -8.9f);
        h.curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f);
        h.lineTo(9.0f, 11.0f);
        h.lineToRelative(3.38f, -7.59f);
        h.curveToRelative(0.29f, -0.67f, -0.2f, -1.41f, -0.92f, -1.41f);
        h.lineTo(4.0f, 2.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.close();
        h.moveTo(18.0f, 2.0f);
        h.curveToRelative(-0.6f, 0.0f, -1.13f, 0.38f, -1.34f, 0.94f);
        h.lineTo(14.22f, 9.8f);
        h.curveToRelative(-0.2f, 0.59f, 0.23f, 1.2f, 0.85f, 1.2f);
        h.curveToRelative(0.38f, 0.0f, 0.72f, -0.24f, 0.84f, -0.6f);
        h.lineTo(16.4f, 9.0f);
        h.horizontalLineToRelative(3.2f);
        h.lineToRelative(0.49f, 1.4f);
        h.curveToRelative(0.13f, 0.36f, 0.46f, 0.6f, 0.84f, 0.6f);
        h.curveToRelative(0.62f, 0.0f, 1.05f, -0.61f, 0.84f, -1.19f);
        h.lineToRelative(-2.44f, -6.86f);
        h.curveTo(19.13f, 2.38f, 18.6f, 2.0f, 18.0f, 2.0f);
        k4.r(h, 16.85f, 7.65f, 18.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(h, 1.15f, 3.65f, -2.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashAuto = build;
        build.getClass();
        return build;
    }
}
