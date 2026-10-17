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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonAddDisabledKt {
    private static ImageVector _personAddDisabled;

    public static final ImageVector getPersonAddDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _personAddDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonAddDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 6.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 0.99f, -0.73f, 1.82f, -1.67f, 1.97f);
        b.lineToRelative(-2.31f, -2.31f);
        b.curveTo(13.19f, 6.72f, 14.01f, 6.0f, 15.0f, 6.0f);
        b.moveToRelative(0.0f, -2.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f);
        b.lineToRelative(3.43f, 3.43f);
        b.curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        k4.r(b, 16.69f, 14.16f, 22.53f, 20.0f);
        b.lineTo(23.0f, 20.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f);
        k4.r(b, 13.01f, 16.13f, 14.88f, 18.0f);
        b.lineTo(9.0f, 18.0f);
        b.curveToRelative(0.08f, -0.24f, 0.88f, -1.01f, 2.91f, -1.57f);
        b.lineToRelative(1.1f, -0.3f);
        b.moveTo(1.41f, 1.71f);
        b.lineTo(0.0f, 3.12f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineTo(4.0f, 10.0f);
        af0.m(b, 1.0f, 10.0f, 2.0f, 3.0f);
        r6.D(b, 3.0f, 2.0f, -3.0f, 2.88f);
        b.lineToRelative(2.51f, 2.51f);
        b.curveTo(9.19f, 15.11f, 7.0f, 16.3f, 7.0f, 18.0f);
        gy.C(b, 2.0f, 9.88f, 4.0f, 4.0f);
        gy.B(b, 1.41f, -1.41f, 1.41f, 1.71f);
        b.moveTo(6.0f, 10.0f);
        b.verticalLineToRelative(-0.88f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.88f, 0.88f, 6.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddDisabled = build;
        build.getClass();
        return build;
    }
}
