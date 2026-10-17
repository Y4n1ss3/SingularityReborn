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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrightnessAutoKt {
    private static ImageVector _brightnessAuto;

    public static final ImageVector getBrightnessAuto(Icons.Sharp sharp) {
        ImageVector imageVector = _brightnessAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BrightnessAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(10.85f, 12.65f, 2.3f, 12.0f, 9.0f);
        fc.B(p, -1.15f, 3.65f, 20.0f, 8.69f);
        p.verticalLineTo(4.0f);
        p.horizontalLineToRelative(-4.69f);
        p.lineTo(12.0f, 0.69f);
        r6.w(p, 8.69f, 4.0f, 4.0f, 4.69f);
        p.lineTo(0.69f, 12.0f);
        fc.t(p, 4.0f, 15.31f, 20.0f, 4.69f);
        p.lineTo(12.0f, 23.31f);
        r6.w(p, 15.31f, 20.0f, 20.0f, -4.69f);
        r6.C(p, 23.31f, 12.0f, 20.0f, 8.69f);
        p.moveTo(14.3f, 16.0f);
        p.lineToRelative(-0.7f, -2.0f);
        r6.t(p, -3.2f, -0.7f, 2.0f, 7.8f);
        p.lineTo(11.0f, 7.0f);
        p.horizontalLineToRelative(2.0f);
        p.lineToRelative(3.2f, 9.0f);
        p.horizontalLineToRelative(-1.9f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessAuto = build;
        build.getClass();
        return build;
    }
}
