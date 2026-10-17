package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsInputCompositeKt {
    private static ImageVector _settingsInputComposite;

    public static final ImageVector getSettingsInputComposite(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsInputComposite;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsInputComposite", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.0f, 2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        bv.q(b, 4.0f, 1.0f, 6.0f, 6.0f);
        b.horizontalLineToRelative(6.0f);
        b.lineTo(7.0f, 6.0f);
        r6.C(b, 5.0f, 6.0f, 5.0f, 2.0f);
        b.moveTo(9.0f, 18.82f);
        uo.n(b, 2.0f, 11.0f, 23.0f, 2.0f);
        uo.B(b, -4.18f, 2.0f, 15.0f, 14.0f);
        bv.r(b, 9.0f, 14.0f, 4.82f);
        b.moveTo(1.0f, 18.82f);
        uo.n(b, 2.0f, 3.0f, 23.0f, 2.0f);
        uo.B(b, -4.18f, 2.0f, 7.0f, 14.0f);
        bv.r(b, 1.0f, 14.0f, 4.82f);
        b.moveTo(21.0f, 6.0f);
        b.lineTo(21.0f, 2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        r6.D(b, 4.0f, -2.0f, 6.0f, 6.0f);
        uf.j(b, 23.0f, 6.0f, -2.0f);
        b.moveTo(13.0f, 2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        bv.q(b, 4.0f, 9.0f, 6.0f, 6.0f);
        uo.n(b, 6.0f, 15.0f, 6.0f, -2.0f);
        uo.l(b, 13.0f, 2.0f, 17.0f, 18.82f);
        uo.n(b, 2.0f, 19.0f, 23.0f, 2.0f);
        uo.B(b, -4.18f, 2.0f, 23.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, -6.0f, 4.82f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputComposite = build;
        build.getClass();
        return build;
    }
}
