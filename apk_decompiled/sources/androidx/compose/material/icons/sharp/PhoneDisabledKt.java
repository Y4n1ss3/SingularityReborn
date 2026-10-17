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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.52f, 17.35f);
        b.curveTo(11.39f, 19.83f, 7.36f, 21.22f, 3.0f, 20.97f);
        b.verticalLineToRelative(-5.51f);
        b.lineToRelative(5.27f, -0.61f);
        b.lineToRelative(2.52f, 2.52f);
        b.curveToRelative(0.81f, -0.41f, 1.58f, -0.9f, 2.3f, -1.45f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.42f, -1.41f);
        b.lineTo(21.19f, 21.2f);
        gy.B(b, -1.41f, 1.41f, 14.52f, 17.35f);
        b.moveTo(15.91f, 13.11f);
        b.curveToRelative(0.56f, -0.73f, 1.05f, -1.51f, 1.47f, -2.33f);
        b.lineToRelative(-2.53f, -2.53f);
        b.lineTo(15.46f, 3.0f);
        b.horizontalLineToRelative(5.51f);
        b.curveToRelative(0.25f, 4.37f, -1.15f, 8.4f, -3.63f, 11.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 15.91f, 13.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneDisabled = build;
        build.getClass();
        return build;
    }
}
