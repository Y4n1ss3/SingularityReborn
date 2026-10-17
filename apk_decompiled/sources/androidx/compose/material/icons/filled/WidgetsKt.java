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
import defpackage.bv;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WidgetsKt {
    private static ImageVector _widgets;

    public static final ImageVector getWidgets(Icons.Filled filled) {
        ImageVector imageVector = _widgets;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Widgets", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(13.0f, 13.0f, 8.0f, 8.0f, -8.0f);
        kp0.A(s, -8.0f, 3.0f, 21.0f, 8.0f);
        bv.n(s, -8.0f, 3.0f, 13.0f, 8.0f);
        bv.y(s, 3.0f, 3.0f, 8.0f, 8.0f);
        r6.C(s, 11.0f, 3.0f, 3.0f, 3.0f);
        s.moveTo(16.66f, 1.69f);
        s.lineTo(11.0f, 7.34f);
        s.lineTo(16.66f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(s, 5.66f, -5.66f, -5.66f, -5.65f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _widgets = build;
        build.getClass();
        return build;
    }
}
