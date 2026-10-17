package androidx.compose.material.icons.twotone;

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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HorizontalSplitKt {
    private static ImageVector _horizontalSplit;

    public static final ImageVector getHorizontalSplit(Icons.TwoTone twoTone) {
        ImageVector imageVector = _horizontalSplit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HorizontalSplit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(19.0f, 15.0f, 2.0f, 5.0f, 17.0f);
        y.verticalLineToRelative(-2.0f);
        y.horizontalLineToRelative(14.0f);
        y.moveToRelative(2.0f, -10.0f);
        af0.m(y, 3.0f, 5.0f, 2.0f, 18.0f);
        uo.l(y, 21.0f, 5.0f, 21.0f, 9.0f);
        af0.m(y, 3.0f, 9.0f, 2.0f, 18.0f);
        uo.l(y, 21.0f, 9.0f, 21.0f, 13.0f);
        af0.m(y, 3.0f, 13.0f, 6.0f, 18.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(y, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.f(5.0f, 15.0f, 14.0f, 2.0f, 5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _horizontalSplit = build;
        build.getClass();
        return build;
    }
}
