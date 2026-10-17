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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoEncryptionKt {
    private static ImageVector _noEncryption;

    public static final ImageVector getNoEncryption(Icons.Outlined outlined) {
        ImageVector imageVector = _noEncryption;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoEncryption", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.9f, 6.0f);
        b.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        b.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        gy.C(b, 2.0f, -4.66f, 2.0f, 2.0f);
        k4.q(b, 18.0f, 5.56f, 2.0f, 2.0f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-1.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b.curveToRelative(-2.32f, 0.0f, -4.26f, 1.59f, -4.82f, 3.74f);
        uf.o(b, 8.9f, 6.46f, 6.0f);
        b.moveTo(4.41f, 4.81f);
        b.lineTo(3.0f, 6.22f);
        b.lineToRelative(2.04f, 2.04f);
        b.curveTo(4.42f, 8.6f, 4.0f, 9.25f, 4.0f, 10.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.78f);
        b.lineToRelative(1.0f, 1.0f);
        gy.B(b, 1.41f, -1.41f, 4.41f, 4.81f);
        kp0.t(b, 6.0f, 20.0f, 10.0f, 0.78f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(b, 10.0f, 10.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noEncryption = build;
        build.getClass();
        return build;
    }
}
