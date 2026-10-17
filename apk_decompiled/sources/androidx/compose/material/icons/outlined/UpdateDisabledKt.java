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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdateDisabledKt {
    private static ImageVector _updateDisabled;

    public static final ImageVector getUpdateDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.UpdateDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.94f, 13.0f);
        b.curveToRelative(-0.15f, 1.38f, -0.62f, 2.67f, -1.33f, 3.79f);
        b.lineToRelative(-1.47f, -1.47f);
        b.curveToRelative(0.38f, -0.71f, 0.65f, -1.49f, 0.77f, -2.32f);
        k4.w(b, 20.94f, 8.67f, 5.84f);
        b.curveTo(9.66f, 5.31f, 10.8f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(2.37f, 0.0f, 4.47f, 1.19f, 5.74f, 3.0f);
        af0.g(b, 15.0f, 2.0f, 6.0f, 4.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(2.36f);
        b.curveTo(17.35f, 4.32f, 14.83f, 3.0f, 12.0f, 3.0f);
        b.curveToRelative(-1.76f, 0.0f, -3.4f, 0.51f, -4.78f, 1.39f);
        uo.l(b, 8.67f, 5.84f, 11.0f, 7.0f);
        k4.z(b, 1.17f, 2.0f, 2.0f, 7.0f);
        k4.w(b, 11.0f, 19.78f, 22.61f);
        b.lineToRelative(-3.0f, -3.0f);
        b.curveTo(15.39f, 20.48f, 13.76f, 21.0f, 12.0f, 21.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, -4.03f, -9.0f, -9.0f);
        b.curveToRelative(0.0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, 18.38f, 18.38f, 19.78f, 22.61f);
        b.moveTo(15.32f, 18.15f);
        b.lineTo(5.84f, 8.67f);
        b.curveTo(5.31f, 9.66f, 5.0f, 10.8f, 5.0f, 12.0f);
        b.curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f);
        b.curveTo(13.2f, 19.0f, 14.34f, 18.69f, 15.32f, 18.15f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = build;
        build.getClass();
        return build;
    }
}
