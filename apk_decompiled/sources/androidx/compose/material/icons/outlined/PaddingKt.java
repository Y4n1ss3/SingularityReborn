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
import defpackage.af0;
import defpackage.bv;
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaddingKt {
    private static ImageVector _padding;

    public static final ImageVector getPadding(Icons.Outlined outlined) {
        ImageVector imageVector = _padding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Padding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(3.0f, 5.0f, 14.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(14.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.horizontalLineTo(5.0f);
        h.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        c21.d(h, 19.0f, 19.0f, 5.0f, 5.0f);
        uo.r(h, 14.0f, 19.0f, 11.0f, 7.0f);
        bv.l(h, 2.0f, 2.0f, -2.0f, 7.0f);
        k4.C(h, 7.0f, 7.0f, 2.0f, 2.0f);
        bv.s(h, 7.0f, 7.0f, 15.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(h, 2.0f, 2.0f, -2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _padding = build;
        build.getClass();
        return build;
    }
}
