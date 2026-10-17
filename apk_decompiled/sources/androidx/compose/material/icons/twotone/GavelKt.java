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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GavelKt {
    private static ImageVector _gavel;

    public static final ImageVector getGavel(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gavel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Gavel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(1.0f, 21.0f, 12.0f, 2.0f, 1.0f);
        r6.l(d, -2.0f, 5.24f, 8.07f);
        d.lineToRelative(2.83f, -2.83f);
        d.lineToRelative(14.14f, 14.14f);
        gy.B(d, -2.83f, 2.83f, 5.24f, 8.07f);
        d.moveTo(12.32f, 1.0f);
        d.lineToRelative(5.66f, 5.66f);
        d.lineToRelative(-2.83f, 2.83f);
        gy.B(d, -5.66f, -5.66f, 12.32f, 1.0f);
        d.moveTo(3.83f, 9.48f);
        d.lineToRelative(5.66f, 5.66f);
        d.lineToRelative(-2.83f, 2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(d, 1.0f, 12.31f, 2.83f, -2.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gavel = build;
        build.getClass();
        return build;
    }
}
