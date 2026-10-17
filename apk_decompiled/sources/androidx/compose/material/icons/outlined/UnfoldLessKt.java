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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnfoldLessKt {
    private static ImageVector _unfoldLess;

    public static final ImageVector getUnfoldLess(Icons.Outlined outlined) {
        ImageVector imageVector = _unfoldLess;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.UnfoldLess", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.41f, 18.59f, 8.83f, 20.0f);
        i.lineTo(12.0f, 16.83f);
        i.lineTo(15.17f, 20.0f);
        i.lineToRelative(1.41f, -1.41f);
        bv.o(i, 12.0f, 14.0f, -4.59f, 4.59f);
        i.moveTo(16.59f, 5.41f);
        i.lineTo(15.17f, 4.0f);
        i.lineTo(12.0f, 7.17f);
        i.lineTo(8.83f, 4.0f);
        i.lineTo(7.41f, 5.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 12.0f, 10.0f, 4.59f, -4.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unfoldLess = build;
        build.getClass();
        return build;
    }
}
