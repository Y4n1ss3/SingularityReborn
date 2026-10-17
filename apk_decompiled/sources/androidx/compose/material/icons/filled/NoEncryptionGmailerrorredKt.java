package androidx.compose.material.icons.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoEncryptionGmailerrorredKt {
    private static ImageVector _noEncryptionGmailerrorred;

    public static final ImageVector getNoEncryptionGmailerrorred(Icons.Filled filled) {
        ImageVector imageVector = _noEncryptionGmailerrorred;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoEncryptionGmailerrorred", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.9f, 6.0f);
        b.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        b.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        uo.B(b, 2.0f, -4.27f, 20.0f, 17.17f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-1.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b.curveTo(9.79f, 1.0f, 7.93f, 2.45f, 7.27f, 4.44f);
        uf.o(b, 8.9f, 6.07f, 6.0f);
        b.moveTo(2.1f, 2.1f);
        b.lineTo(0.69f, 3.51f);
        b.lineTo(5.3f, 8.13f);
        b.curveTo(4.55f, 8.42f, 4.0f, 9.15f, 4.0f, 10.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f);
        b.lineToRelative(1.56f, 1.56f);
        gy.B(b, 1.41f, -1.41f, 2.1f, 2.1f);
        b.moveTo(12.0f, 17.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f);
        b.lineToRelative(2.81f, 2.81f);
        b.curveTo(13.12f, 16.73f, 12.59f, 17.0f, 12.0f, 17.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noEncryptionGmailerrorred = build;
        build.getClass();
        return build;
    }
}
