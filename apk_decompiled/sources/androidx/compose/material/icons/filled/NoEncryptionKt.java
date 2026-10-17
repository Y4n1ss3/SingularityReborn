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
import defpackage.af0;
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoEncryptionKt {
    private static ImageVector _noEncryption;

    public static final ImageVector getNoEncryption(Icons.Filled filled) {
        ImageVector imageVector = _noEncryption;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoEncryption", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 21.78f, 4.22f, 5.0f);
        i.lineTo(3.0f, 6.22f);
        i.lineToRelative(2.04f, 2.04f);
        i.curveTo(4.42f, 8.6f, 4.0f, 9.25f, 4.0f, 10.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(0.23f, 0.0f, 0.45f, -0.05f, 0.66f, -0.12f);
        r6.C(i, 19.78f, 23.0f, 21.0f, 21.78f);
        i.moveTo(8.9f, 6.0f);
        i.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        i.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineTo(9.66f);
        i.lineTo(20.0f, 18.34f);
        i.verticalLineTo(10.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineToRelative(-1.0f);
        i.verticalLineTo(6.0f);
        i.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        i.curveToRelative(-2.56f, 0.0f, -4.64f, 1.93f, -4.94f, 4.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(i, 8.9f, 7.24f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noEncryption = build;
        build.getClass();
        return build;
    }
}
