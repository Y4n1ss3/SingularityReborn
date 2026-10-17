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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnfoldMoreKt {
    private static ImageVector _unfoldMore;

    public static final ImageVector getUnfoldMore(Icons.TwoTone twoTone) {
        ImageVector imageVector = _unfoldMore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.UnfoldMore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 5.83f, 15.17f, 9.0f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(12.0f, 3.0f);
        i.lineTo(7.41f, 7.59f);
        r6.C(i, 8.83f, 9.0f, 12.0f, 5.83f);
        i.moveTo(12.0f, 18.17f);
        i.lineTo(8.83f, 15.0f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineTo(12.0f, 21.0f);
        i.lineToRelative(4.59f, -4.59f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 15.17f, 15.0f, 12.0f, 18.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unfoldMore = build;
        build.getClass();
        return build;
    }
}
