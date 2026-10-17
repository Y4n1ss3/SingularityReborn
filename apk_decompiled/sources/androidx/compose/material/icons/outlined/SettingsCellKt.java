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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsCellKt {
    private static ImageVector _settingsCell;

    public static final ImageVector getSettingsCell(Icons.Outlined outlined) {
        ImageVector imageVector = _settingsCell;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsCell", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 22.0f, 2.0f, 2.0f);
        uo.l(b, 7.0f, 24.0f, 11.0f, 22.0f);
        j50.n(b, 2.0f, 2.0f, -2.0f);
        k4.C(b, 15.0f, 22.0f, 2.0f, 2.0f);
        j50.t(b, -2.0f, 16.0f, 0.01f);
        b.lineTo(8.0f, 0.0f);
        b.curveTo(6.9f, 0.0f, 6.0f, 0.9f, 6.0f, 2.0f);
        b.verticalLineToRelative(16.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(18.0f, 2.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        k4.r(b, 16.0f, 18.0f, 8.0f, 18.0f);
        r6.p(b, -1.0f, 8.0f, 1.0f);
        b.moveTo(16.0f, 15.0f);
        b.lineTo(8.0f, 15.0f);
        r6.m(b, 8.0f, 5.0f, 8.0f, 10.0f);
        b.moveTo(16.0f, 3.0f);
        b.lineTo(8.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(b, 8.0f, 2.0f, 8.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsCell = build;
        build.getClass();
        return build;
    }
}
