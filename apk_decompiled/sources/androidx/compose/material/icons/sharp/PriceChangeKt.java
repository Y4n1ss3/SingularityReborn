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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PriceChangeKt {
    private static ImageVector _priceChange;

    public static final ImageVector getPriceChange(Icons.Sharp sharp) {
        ImageVector imageVector = _priceChange;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PriceChange", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 4.0f, 16.0f, 20.0f, 4.0f);
        kp0.B(w, 2.0f, 12.0f, 10.0f, 8.0f);
        r6.D(w, 1.0f, 4.0f, 5.0f, -2.0f);
        af0.s(w, 1.0f, 8.0f, -1.0f, 6.0f);
        uf.s(w, -2.0f, 4.0f, -1.0f, 6.0f);
        gy.z(w, 8.0f, 2.0f, 7.0f, 2.0f);
        k4.p(w, 1.0f, 2.0f, 10.0f);
        w.moveTo(16.0f, 16.25f);
        w.lineToRelative(-2.0f, -2.0f);
        gy.n(w, 4.0f, 16.0f, 16.25f);
        w.moveTo(14.0f, 10.0f);
        w.lineToRelative(2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(w, 2.0f, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _priceChange = build;
        build.getClass();
        return build;
    }
}
