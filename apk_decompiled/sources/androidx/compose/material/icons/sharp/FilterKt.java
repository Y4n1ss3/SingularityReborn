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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterKt {
    private static ImageVector _filter;

    public static final ImageVector getFilter(Icons.Sharp sharp) {
        ImageVector imageVector = _filter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Filter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.96f, 10.29f, -2.75f, 3.54f);
        e.lineToRelative(-1.96f, -2.36f);
        e.lineTo(8.5f, 15.0f);
        uo.w(e, 11.0f, -3.54f, -4.71f);
        e.moveTo(3.0f, 5.0f);
        af0.m(e, 1.0f, 5.0f, 18.0f, 18.0f);
        e.verticalLineToRelative(-2.0f);
        r6.C(e, 3.0f, 21.0f, 3.0f, 5.0f);
        e.moveTo(23.0f, 1.0f);
        af0.m(e, 5.0f, 1.0f, 18.0f, 18.0f);
        uo.l(e, 23.0f, 1.0f, 21.0f, 17.0f);
        e.lineTo(7.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 7.0f, 3.0f, 14.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filter = build;
        build.getClass();
        return build;
    }
}
