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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsInputHdmiKt {
    private static ImageVector _settingsInputHdmi;

    public static final ImageVector getSettingsInputHdmi(Icons.TwoTone twoTone) {
        ImageVector imageVector = _settingsInputHdmi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SettingsInputHdmi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(8.0f, 9.0f, 7.0f, 3.53f);
        q.lineToRelative(2.79f, 5.58f);
        fc.u(q, 0.21f, 0.42f, 20.0f, 4.0f);
        q.verticalLineToRelative(-1.47f);
        q.lineToRelative(0.21f, -0.42f);
        q.lineTo(17.0f, 12.53f);
        q.verticalLineTo(9.0f);
        q.horizontalLineToRelative(-1.0f);
        q.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 7.0f, 18.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.lineTo(8.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.q(i, 3.0f, 5.0f, 7.0f, 6.0f);
        r6.A(i, 3.0f, 6.0f, 3.0f, 8.0f);
        i.verticalLineToRelative(-3.0f);
        i.lineToRelative(3.0f, -6.0f);
        uf.j(i, 19.0f, 7.0f, -1.0f);
        k4.C(i, 8.0f, 4.0f, 8.0f, 3.0f);
        uo.n(i, -2.01f, 13.99f, 5.0f, -1.0f);
        i.verticalLineToRelative(2.0f);
        i.lineTo(11.0f, 7.0f);
        fc.w(i, 11.0f, 5.0f, -1.0f, 2.0f);
        r6.C(i, 8.0f, 7.0f, 8.0f, 4.0f);
        i.moveTo(17.0f, 12.53f);
        i.lineToRelative(-3.0f, 6.0f);
        fc.w(i, 14.0f, 20.0f, -4.0f, -1.47f);
        i.lineToRelative(-3.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 7.0f, 9.0f, 10.0f, 3.53f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputHdmi = build;
        build.getClass();
        return build;
    }
}
