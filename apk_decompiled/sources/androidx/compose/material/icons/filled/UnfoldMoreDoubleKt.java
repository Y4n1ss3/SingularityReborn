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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnfoldMoreDoubleKt {
    private static ImageVector _unfoldMoreDouble;

    public static final ImageVector getUnfoldMoreDouble(Icons.Filled filled) {
        ImageVector imageVector = _unfoldMoreDouble;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.UnfoldMoreDouble", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 7.83f, 15.17f, 11.0f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(12.0f, 5.0f);
        i.lineTo(7.41f, 9.59f);
        r6.C(i, 8.83f, 11.0f, 12.0f, 7.83f);
        i.moveTo(12.0f, 2.83f);
        i.lineTo(15.17f, 6.0f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(12.0f, 0.0f);
        i.lineTo(7.41f, 4.59f);
        r6.C(i, 8.83f, 6.0f, 12.0f, 2.83f);
        i.moveTo(12.0f, 21.17f);
        i.lineTo(8.83f, 18.0f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineTo(12.0f, 24.0f);
        i.lineToRelative(4.59f, -4.59f);
        r6.C(i, 15.17f, 18.0f, 12.0f, 21.17f);
        i.moveTo(12.0f, 16.17f);
        i.lineTo(8.83f, 13.0f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineTo(12.0f, 19.0f);
        i.lineToRelative(4.59f, -4.59f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 15.17f, 13.0f, 12.0f, 16.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unfoldMoreDouble = build;
        build.getClass();
        return build;
    }
}
