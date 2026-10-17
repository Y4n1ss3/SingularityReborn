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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderStyleKt {
    private static ImageVector _borderStyle;

    public static final ImageVector getBorderStyle(Icons.Outlined outlined) {
        ImageVector imageVector = _borderStyle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BorderStyle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(15.0f, 21.0f, 2.0f, -2.0f, -2.0f);
        bv.m(n, 2.0f, 19.0f, 21.0f, 2.0f);
        r6.p(n, -2.0f, -2.0f, 2.0f);
        k4.C(n, 7.0f, 21.0f, 2.0f, -2.0f);
        bv.r(n, 7.0f, 19.0f, 2.0f);
        k4.C(n, 11.0f, 21.0f, 2.0f, -2.0f);
        fc.x(n, -2.0f, 2.0f, 19.0f, 17.0f);
        gy.D(n, 2.0f, -2.0f, -2.0f, 2.0f);
        k4.C(n, 19.0f, 13.0f, 2.0f, -2.0f);
        fc.x(n, -2.0f, 2.0f, 3.0f, 3.0f);
        uo.B(n, 18.0f, 2.0f, 5.0f, 5.0f);
        n.horizontalLineToRelative(16.0f);
        r6.C(n, 21.0f, 3.0f, 3.0f, 3.0f);
        n.moveTo(19.0f, 9.0f);
        uo.n(n, 2.0f, 21.0f, 7.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(n, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderStyle = build;
        build.getClass();
        return build;
    }
}
