package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotListedLocationKt {
    private static ImageVector _notListedLocation;

    public static final ImageVector getNotListedLocation(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _notListedLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.NotListedLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        b.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        b.curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        af0.l(b, 12.88f, 15.75f, -1.75f);
        r6.m(b, 11.13f, 14.0f, 1.75f, 1.75f);
        b.moveTo(12.88f, 12.88f);
        b.horizontalLineToRelative(-1.75f);
        b.curveToRelative(0.0f, -2.84f, 2.62f, -2.62f, 2.62f, -4.38f);
        b.curveToRelative(0.0f, -0.96f, -0.79f, -1.75f, -1.75f, -1.75f);
        b.reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.75f);
        b.lineTo(8.5f, 8.5f);
        b.curveTo(8.5f, 6.57f, 10.07f, 5.0f, 12.0f, 5.0f);
        b.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        b.curveToRelative(0.0f, 2.19f, -2.62f, 2.41f, -2.62f, 4.38f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notListedLocation = build;
        build.getClass();
        return build;
    }
}
