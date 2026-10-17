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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(Icons.Filled filled) {
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Translate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.87f, 15.07f, -2.54f, -2.51f);
        e.lineToRelative(0.03f, -0.03f);
        e.curveToRelative(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        e.lineTo(17.0f, 6.0f);
        e.lineTo(17.0f, 4.0f);
        e.horizontalLineToRelative(-7.0f);
        e.lineTo(10.0f, 2.0f);
        e.lineTo(8.0f, 2.0f);
        bv.q(e, 2.0f, 1.0f, 4.0f, 1.99f);
        e.horizontalLineToRelative(11.17f);
        e.curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        e.curveTo(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveToRelative(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
        e.lineToRelative(-5.09f, 5.02f);
        e.lineTo(4.0f, 19.0f);
        e.lineToRelative(5.0f, -5.0f);
        fc.C(e, 3.11f, 3.11f, 0.76f, -2.04f);
        e.moveTo(18.5f, 10.0f);
        uo.n(e, -2.0f, 12.0f, 22.0f, 2.0f);
        e.lineToRelative(1.12f, -3.0f);
        uo.n(e, 4.75f, 21.0f, 22.0f, 2.0f);
        fc.B(e, -4.5f, -12.0f, 15.88f, 17.0f);
        e.lineToRelative(1.62f, -4.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(e, 19.12f, 17.0f, -3.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _translate = build;
        build.getClass();
        return build;
    }
}
