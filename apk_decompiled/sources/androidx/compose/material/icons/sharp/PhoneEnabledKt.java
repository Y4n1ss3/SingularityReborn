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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneEnabledKt {
    private static ImageVector _phoneEnabled;

    public static final ImageVector getPhoneEnabled(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneEnabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneEnabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.0f, 15.46f, 5.27f, -0.61f);
        e.lineToRelative(2.52f, 2.52f);
        e.curveToRelative(2.83f, -1.44f, 5.15f, -3.75f, 6.59f, -6.59f);
        e.lineToRelative(-2.53f, -2.53f);
        e.lineTo(15.46f, 3.0f);
        e.horizontalLineToRelative(5.51f);
        e.curveTo(21.55f, 13.18f, 13.18f, 21.55f, 3.0f, 20.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 15.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneEnabled = build;
        build.getClass();
        return build;
    }
}
