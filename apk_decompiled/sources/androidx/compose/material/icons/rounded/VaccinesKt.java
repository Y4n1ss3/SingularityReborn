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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VaccinesKt {
    private static ImageVector _vaccines;

    public static final ImageVector getVaccines(Icons.Rounded rounded) {
        ImageVector imageVector = _vaccines;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Vaccines", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 22.5f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(17.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(7.5f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        uf.t(b, 8.0f, 4.0f, 0.5f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        r6.y(b, 6.0f, 1.5f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(4.5f);
        b.curveTo(6.0f, 22.05f, 6.45f, 22.5f, 7.0f, 22.5f);
        r6.g(b, 9.0f, 9.0f, 7.25f);
        b.curveTo(6.84f, 9.0f, 6.5f, 9.34f, 6.5f, 9.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        fc.q(b, 9.0f, 12.0f, 7.25f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        bv.u(b, 9.0f, 9.0f, 15.0f, 5.0f);
        c21.c(b, 7.5f, 4.0f, 9.0f);
        b.moveTo(19.5f, 10.5f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.verticalLineToRelative(0.5f);
        b.curveToRelative(0.0f, 0.5f, -1.5f, 1.16f, -1.5f, 3.0f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-6.5f);
        b.curveTo(21.0f, 11.66f, 19.5f, 11.0f, 19.5f, 10.5f);
        fc.A(b, 16.5f, 10.5f, 10.0f, 1.0f);
        b.verticalLineToRelative(0.5f);
        b.curveToRelative(0.0f, 1.6f, 1.5f, 2.0f, 1.5f, 3.0f);
        b.verticalLineTo(14.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.21f, 0.0f, -0.39f, 0.0f, -0.5f);
        b.curveTo(15.0f, 12.5f, 16.5f, 12.1f, 16.5f, 10.5f);
        b.close();
        b.moveTo(15.0f, 20.0f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, -0.63f, 0.0f, -1.5f);
        b.horizontalLineToRelative(4.0f);
        b.verticalLineTo(20.0f);
        b.horizontalLineTo(15.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vaccines = build;
        build.getClass();
        return build;
    }
}
