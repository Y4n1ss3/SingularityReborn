package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneCallbackKt {
    private static ImageVector _phoneCallback;

    public static final ImageVector getPhoneCallback(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _phoneCallback;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.PhoneCallback", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.62f, 10.79f);
        b.curveToRelative(1.44f, 2.83f, 3.76f, 5.14f, 6.59f, 6.59f);
        b.lineToRelative(2.2f, -2.2f);
        b.curveToRelative(0.27f, -0.27f, 0.67f, -0.36f, 1.02f, -0.24f);
        b.curveToRelative(1.12f, 0.37f, 2.33f, 0.57f, 3.57f, 0.57f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.lineTo(21.0f, 20.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.curveToRelative(-9.39f, 0.0f, -17.0f, -7.61f, -17.0f, -17.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(3.5f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.curveToRelative(0.0f, 1.25f, 0.2f, 2.45f, 0.57f, 3.57f);
        b.curveToRelative(0.11f, 0.35f, 0.03f, 0.74f, -0.25f, 1.02f);
        fc.B(b, -2.2f, 2.2f, 20.16f, 3.69f);
        b.lineToRelative(-0.71f, -0.7f);
        b.lineTo(13.0f, 9.29f);
        fc.w(b, 13.0f, 5.0f, -1.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(b, 6.0f, -1.0f, -4.15f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneCallback = build;
        build.getClass();
        return build;
    }
}
