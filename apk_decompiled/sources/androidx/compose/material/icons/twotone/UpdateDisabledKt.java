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
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdateDisabledKt {
    private static ImageVector _updateDisabled;

    public static final ImageVector getUpdateDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.UpdateDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.67f, 5.84f, 7.22f, 4.39f);
        i.curveTo(8.6f, 3.51f, 10.24f, 3.0f, 12.0f, 3.0f);
        i.curveToRelative(2.74f, 0.0f, 5.19f, 1.23f, 6.84f, 3.16f);
        af0.m(i, 21.0f, 4.0f, 6.0f, -6.0f);
        i.lineToRelative(2.41f, -2.41f);
        i.curveTo(16.12f, 6.02f, 14.18f, 5.0f, 12.0f, 5.0f);
        i.curveTo(10.8f, 5.0f, 9.66f, 5.31f, 8.67f, 5.84f);
        r6.B(i, 13.0f, 7.0f, -2.0f, 1.17f);
        uf.x(i, 2.0f, 2.0f, 7.0f);
        i.moveTo(19.78f, 22.61f);
        i.lineToRelative(-3.0f, -3.0f);
        i.curveTo(15.39f, 20.48f, 13.76f, 21.0f, 12.0f, 21.0f);
        i.curveToRelative(-4.97f, 0.0f, -9.0f, -4.03f, -9.0f, -9.0f);
        i.curveToRelative(0.0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(1.41f, -1.41f);
        gy.B(i, 18.38f, 18.38f, 19.78f, 22.61f);
        i.moveTo(15.32f, 18.15f);
        i.lineTo(5.84f, 8.67f);
        i.curveTo(5.31f, 9.66f, 5.0f, 10.8f, 5.0f, 12.0f);
        i.curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f);
        i.curveTo(13.2f, 19.0f, 14.34f, 18.69f, 15.32f, 18.15f);
        af0.l(i, 20.94f, 13.0f, -2.02f);
        i.curveToRelative(-0.12f, 0.83f, -0.39f, 1.61f, -0.77f, 2.32f);
        i.lineToRelative(1.47f, 1.47f);
        i.curveTo(20.32f, 15.67f, 20.79f, 14.38f, 20.94f, 13.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = build;
        build.getClass();
        return build;
    }
}
