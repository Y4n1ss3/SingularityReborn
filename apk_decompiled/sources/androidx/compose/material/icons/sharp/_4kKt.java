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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _4kKt {
    private static ImageVector __4k;

    public static final ImageVector get_4k(Icons.Sharp sharp) {
        ImageVector imageVector = __4k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._4k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 3.0f, 3.0f, 3.0f, 18.0f);
        gy.n(s, 18.0f, 21.0f, 3.0f);
        s.moveTo(12.0f, 13.51f);
        s.horizontalLineToRelative(-1.0f);
        s.lineTo(11.0f, 15.0f);
        af0.m(s, 9.5f, 15.0f, -1.5f, -3.0f);
        s.lineTo(6.5f, 9.0f);
        af0.m(s, 8.0f, 9.0f, 3.0f, 1.5f);
        s.lineTo(9.5f, 9.0f);
        af0.m(s, 11.0f, 9.0f, 3.0f, 1.0f);
        bv.m(s, 1.51f, 18.2f, 15.0f, -1.7f);
        s.lineToRelative(-2.0f, -3.0f);
        s.verticalLineToRelative(3.0f);
        s.lineTo(13.0f, 15.0f);
        fc.w(s, 13.0f, 9.0f, 1.5f, 3.0f);
        s.lineToRelative(2.0f, -3.0f);
        s.horizontalLineToRelative(1.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(s, -2.0f, 3.0f, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4k = build;
        build.getClass();
        return build;
    }
}
