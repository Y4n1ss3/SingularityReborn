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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EggAltKt {
    private static ImageVector _eggAlt;

    public static final ImageVector getEggAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _eggAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EggAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 9.0f);
        b.curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f);
        b.curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f);
        b.curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f);
        b.curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f);
        b.curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f);
        b.curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f);
        b.close();
        b.moveTo(12.0f, 15.5f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        b.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.93f, 15.5f, 12.0f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eggAlt = build;
        build.getClass();
        return build;
    }
}
