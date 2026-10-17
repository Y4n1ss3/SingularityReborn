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
import defpackage.af0;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrightnessAutoKt {
    private static ImageVector _brightnessAuto;

    public static final ImageVector getBrightnessAuto(Icons.Outlined outlined) {
        ImageVector imageVector = _brightnessAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BrightnessAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(11.0f, 7.0f, -3.2f, 9.0f, 1.9f);
        b.lineToRelative(0.7f, -2.0f);
        kf0.B(b, 3.2f, 0.7f, 2.0f, 1.9f);
        uf.j(b, 13.0f, 7.0f, -2.0f);
        b.moveTo(10.85f, 12.65f);
        b.lineTo(12.0f, 9.0f);
        uf.r(b, 1.15f, 3.65f, -2.3f);
        b.moveTo(20.0f, 8.69f);
        b.lineTo(20.0f, 4.0f);
        b.horizontalLineToRelative(-4.69f);
        b.lineTo(12.0f, 0.69f);
        b.lineTo(8.69f, 4.0f);
        b.lineTo(4.0f, 4.0f);
        b.verticalLineToRelative(4.69f);
        b.lineTo(0.69f, 12.0f);
        b.lineTo(4.0f, 15.31f);
        b.lineTo(4.0f, 20.0f);
        b.horizontalLineToRelative(4.69f);
        b.lineTo(12.0f, 23.31f);
        b.lineTo(15.31f, 20.0f);
        b.lineTo(20.0f, 20.0f);
        b.verticalLineToRelative(-4.69f);
        r6.C(b, 23.31f, 12.0f, 20.0f, 8.69f);
        b.moveTo(18.0f, 14.48f);
        b.lineTo(18.0f, 18.0f);
        b.horizontalLineToRelative(-3.52f);
        b.lineTo(12.0f, 20.48f);
        b.lineTo(9.52f, 18.0f);
        b.lineTo(6.0f, 18.0f);
        b.verticalLineToRelative(-3.52f);
        b.lineTo(3.52f, 12.0f);
        b.lineTo(6.0f, 9.52f);
        b.lineTo(6.0f, 6.0f);
        b.horizontalLineToRelative(3.52f);
        b.lineTo(12.0f, 3.52f);
        b.lineTo(14.48f, 6.0f);
        b.lineTo(18.0f, 6.0f);
        b.verticalLineToRelative(3.52f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 20.48f, 12.0f, 18.0f, 14.48f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessAuto = build;
        build.getClass();
        return build;
    }
}
