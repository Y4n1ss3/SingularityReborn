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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoEncryptionKt {
    private static ImageVector _noEncryption;

    public static final ImageVector getNoEncryption(Icons.Sharp sharp) {
        ImageVector imageVector = _noEncryption;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoEncryption", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.9f, 6.0f);
        b.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        b.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        uo.B(b, 2.0f, -4.66f, 20.0f, 17.56f);
        uf.z(b, 8.0f, -3.0f, 6.22f);
        b.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        b.curveToRelative(-2.53f, -0.25f, -4.72f, 1.41f, -5.32f, 3.7f);
        uf.o(b, 8.9f, 6.46f, 6.0f);
        b.moveTo(4.41f, 4.81f);
        b.lineTo(3.0f, 6.22f);
        r6.w(b, 4.78f, 8.0f, 4.0f, 14.0f);
        b.horizontalLineToRelative(14.78f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 1.0f, 1.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noEncryption = build;
        build.getClass();
        return build;
    }
}
