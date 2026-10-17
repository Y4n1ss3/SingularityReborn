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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatListNumberedKt {
    private static ImageVector _formatListNumbered;

    public static final ImageVector getFormatListNumbered(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatListNumbered;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatListNumbered", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(5.0f, 13.0f, 3.2f, 13.0f);
        i.lineTo(5.0f, 10.9f);
        i.lineTo(5.0f, 10.0f);
        af0.m(i, 2.0f, 10.0f, 1.0f, 1.8f);
        kp0.x(i, 2.0f, 13.1f, 0.9f, 3.0f);
        k4.C(i, 7.0f, 5.0f, 14.0f, 2.0f);
        uo.l(i, 7.0f, 7.0f, 5.0f, 16.0f);
        af0.m(i, 2.0f, 16.0f, 1.0f, 2.0f);
        bv.q(i, 0.5f, 3.0f, 17.5f, 1.0f);
        bv.C(i, 1.0f, 0.5f, 2.0f, 19.0f);
        kf0.C(i, 1.0f, 3.0f, 7.0f, 17.0f);
        j50.o(i, 14.0f, 2.0f, 7.0f, 19.0f);
        i.moveTo(3.0f, 8.0f);
        i.horizontalLineToRelative(1.0f);
        i.lineTo(4.0f, 4.0f);
        kp0.x(i, 2.0f, 4.0f, 1.0f, 1.0f);
        k4.C(i, 7.0f, 11.0f, 14.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 7.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListNumbered = build;
        build.getClass();
        return build;
    }
}
