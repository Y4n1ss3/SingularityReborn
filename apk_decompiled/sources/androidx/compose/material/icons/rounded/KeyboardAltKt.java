package androidx.compose.material.icons.rounded;

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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardAltKt {
    private static ImageVector _keyboardAlt;

    public static final ImageVector getKeyboardAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _keyboardAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 4.0f, 3.0f);
        d.curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
        d.verticalLineToRelative(13.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(23.0f, 4.9f, 22.1f, 4.0f, 21.0f, 4.0f);
        af0.A(d, 7.0f, 12.0f, 2.0f, 5.0f);
        kf0.n(d, -2.0f, 7.0f, 5.0f, 10.0f);
        j50.C(d, 8.0f, 2.0f, 2.0f, 5.0f);
        uf.D(d, 11.0f, 12.0f, 2.0f, 9.0f);
        kf0.n(d, -2.0f, 11.0f, 9.0f, 10.0f);
        j50.C(d, 8.0f, 2.0f, 2.0f, 9.0f);
        d.moveTo(16.0f, 16.5f);
        d.lineTo(16.0f, 16.5f);
        d.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        d.horizontalLineToRelative(-7.0f);
        d.curveTo(8.22f, 17.0f, 8.0f, 16.78f, 8.0f, 16.5f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveTo(8.0f, 16.22f, 8.22f, 16.0f, 8.5f, 16.0f);
        d.horizontalLineToRelative(7.0f);
        d.curveTo(15.78f, 16.0f, 16.0f, 16.22f, 16.0f, 16.5f);
        uo.C(d, 15.0f, 12.0f, 2.0f, -2.0f);
        kf0.n(d, -2.0f, 15.0f, 13.0f, 10.0f);
        j50.C(d, 8.0f, 2.0f, 2.0f, 13.0f);
        bv.y(d, 17.0f, 14.0f, -2.0f, 2.0f);
        kf0.n(d, 2.0f, 17.0f, 19.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(d, -2.0f, 8.0f, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardAlt = build;
        build.getClass();
        return build;
    }
}
