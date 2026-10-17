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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StoreKt {
    private static ImageVector _store;

    public static final ImageVector getStore(Icons.Filled filled) {
        ImageVector imageVector = _store;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Store", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(20.0f, 4.0f, 4.0f, 4.0f, 2.0f);
        gy.n(s, 16.0f, 20.0f, 4.0f);
        s.moveTo(21.0f, 14.0f);
        s.verticalLineToRelative(-2.0f);
        s.lineToRelative(-1.0f, -5.0f);
        s.lineTo(4.0f, 7.0f);
        r6.A(s, -1.0f, 5.0f, 2.0f, 1.0f);
        r6.D(s, 6.0f, 10.0f, -6.0f, 4.0f);
        af0.C(s, 6.0f, 2.0f, -6.0f, 1.0f);
        s.moveTo(12.0f, 18.0f);
        af0.m(s, 6.0f, 18.0f, -4.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(s, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _store = build;
        build.getClass();
        return build;
    }
}
