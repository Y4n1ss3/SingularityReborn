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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpenInNewOffKt {
    private static ImageVector _openInNewOff;

    public static final ImageVector getOpenInNewOff(Icons.Outlined outlined) {
        ImageVector imageVector = _openInNewOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.OpenInNewOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(16.79f, 5.8f, 14.0f, 3.0f, 7.0f);
        k.verticalLineToRelative(7.0f);
        k.lineToRelative(-2.79f, -2.8f);
        k.lineToRelative(-4.09f, 4.09f);
        gy.B(k, -1.41f, -1.41f, 16.79f, 5.8f);
        k.moveTo(19.0f, 12.0f);
        k4.z(k, 4.17f, 2.0f, 2.0f, 12.0f);
        k4.w(k, 19.0f, 19.78f, 22.61f);
        k.lineTo(18.17f, 21.0f);
        k.horizontalLineTo(5.0f);
        k.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        k.verticalLineTo(5.83f);
        k.lineTo(1.39f, 4.22f);
        k.lineToRelative(1.41f, -1.41f);
        gy.B(k, 18.38f, 18.38f, 19.78f, 22.61f);
        k.moveTo(16.17f, 19.0f);
        k.lineToRelative(-4.88f, -4.88f);
        k.lineTo(9.7f, 15.71f);
        k.lineTo(8.29f, 14.3f);
        k.lineToRelative(1.59f, -1.59f);
        j50.z(k, 5.0f, 7.83f, 19.0f, 16.17f);
        uo.p(k, 7.83f, 5.0f, 12.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(k, 5.83f, 7.83f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openInNewOff = build;
        build.getClass();
        return build;
    }
}
