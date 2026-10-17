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
import defpackage.af0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataObjectKt {
    private static ImageVector _dataObject;

    public static final ImageVector getDataObject(Icons.Filled filled) {
        ImageVector imageVector = _dataObject;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DataObject", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(4.0f, 7.0f, 2.0f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        af0.u(h, 2.0f, 4.0f, 1.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        h.verticalLineToRelative(2.0f);
        h.curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f);
        k4.k(h, 3.0f, -2.0f, 7.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        h.verticalLineToRelative(-2.0f);
        h.curveToRelative(0.0f, -1.3f, -0.84f, -2.42f, -2.0f, -2.83f);
        h.verticalLineToRelative(-0.34f);
        h.curveTo(5.16f, 11.42f, 6.0f, 10.3f, 6.0f, 9.0f);
        h.verticalLineTo(7.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        uo.f(h, 3.0f, 4.0f, 7.0f);
        h.curveTo(5.35f, 4.0f, 4.0f, 5.35f, 4.0f, 7.0f);
        h.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 10.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineTo(7.0f);
        b.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        kf0.x(b, -3.0f, 2.0f, 3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 1.3f, 0.84f, 2.42f, 2.0f, 2.83f);
        b.verticalLineToRelative(0.34f);
        b.curveToRelative(-1.16f, 0.41f, -2.0f, 1.52f, -2.0f, 2.83f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        kf0.x(b, -3.0f, 2.0f, 3.0f);
        b.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.m(b, 1.0f, -4.0f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataObject = build;
        build.getClass();
        return build;
    }
}
