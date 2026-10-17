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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BungalowKt {
    private static ImageVector _bungalow;

    public static final ImageVector getBungalow(Icons.Outlined outlined) {
        ImageVector imageVector = _bungalow;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bungalow", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 14.0f, -2.0f, -2.0f, 2.0f);
        bv.t(n, 14.0f, 18.1f, 16.56f);
        uf.u(n, 17.0f, 14.79f, 21.0f, 7.0f);
        n.verticalLineToRelative(-6.2f);
        n.lineToRelative(-1.1f, 1.76f);
        n.lineTo(4.2f, 15.5f);
        n.lineTo(12.0f, 3.0f);
        gy.B(n, 7.8f, 12.5f, 18.1f, 16.56f);
        n.moveTo(15.0f, 11.59f);
        n.lineToRelative(-3.0f, -4.8f);
        fc.u(n, -3.0f, 4.8f, 19.0f, 2.0f);
        r6.D(n, -3.0f, 2.0f, 3.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 11.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bungalow = build;
        build.getClass();
        return build;
    }
}
