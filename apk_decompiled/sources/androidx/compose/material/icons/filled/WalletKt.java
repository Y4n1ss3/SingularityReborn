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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WalletKt {
    private static ImageVector _wallet;

    public static final ImageVector getWallet(Icons.Filled filled) {
        ImageVector imageVector = _wallet;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Wallet", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 4.0f, 6.0f);
        d.curveTo(3.79f, 4.0f, 2.0f, 5.79f, 2.0f, 8.0f);
        d.verticalLineToRelative(8.0f);
        d.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        d.verticalLineTo(8.0f);
        d.curveTo(22.0f, 5.79f, 20.21f, 4.0f, 18.0f, 4.0f);
        d.close();
        d.moveTo(16.14f, 13.77f);
        d.curveToRelative(-0.24f, 0.2f, -0.57f, 0.28f, -0.88f, 0.2f);
        d.lineTo(4.15f, 11.25f);
        d.curveTo(4.45f, 10.52f, 5.16f, 10.0f, 6.0f, 10.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(0.67f, 0.0f, 1.26f, 0.34f, 1.63f, 0.84f);
        uo.l(d, 16.14f, 13.77f, 6.0f, 6.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        d.verticalLineToRelative(0.55f);
        d.curveTo(19.41f, 8.21f, 18.73f, 8.0f, 18.0f, 8.0f);
        d.horizontalLineTo(6.0f);
        d.curveTo(5.27f, 8.0f, 4.59f, 8.21f, 4.0f, 8.55f);
        d.verticalLineTo(8.0f);
        d.curveTo(4.0f, 6.9f, 4.9f, 6.0f, 6.0f, 6.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wallet = build;
        build.getClass();
        return build;
    }
}
