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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ZoomOutMapKt {
    private static ImageVector _zoomOutMap;

    public static final ImageVector getZoomOutMap(Icons.Sharp sharp) {
        ImageVector imageVector = _zoomOutMap;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ZoomOutMap", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.0f, 3.0f, 2.3f, 2.3f);
        e.lineToRelative(-2.89f, 2.87f);
        e.lineToRelative(1.42f, 1.42f);
        e.lineTo(18.7f, 6.7f);
        e.lineTo(21.0f, 9.0f);
        uf.j(e, 21.0f, 3.0f, -6.0f);
        e.moveTo(3.0f, 9.0f);
        e.lineToRelative(2.3f, -2.3f);
        e.lineToRelative(2.87f, 2.89f);
        e.lineToRelative(1.42f, -1.42f);
        e.lineTo(6.7f, 5.3f);
        e.lineTo(9.0f, 3.0f);
        bv.r(e, 3.0f, 3.0f, 6.0f);
        e.moveTo(9.0f, 21.0f);
        e.lineToRelative(-2.3f, -2.3f);
        e.lineToRelative(2.89f, -2.87f);
        e.lineToRelative(-1.42f, -1.42f);
        e.lineTo(5.3f, 17.3f);
        kp0.x(e, 3.0f, 15.0f, 6.0f, 6.0f);
        e.moveTo(21.0f, 15.0f);
        e.lineToRelative(-2.3f, 2.3f);
        e.lineToRelative(-2.87f, -2.89f);
        e.lineToRelative(-1.42f, 1.42f);
        e.lineToRelative(2.89f, 2.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 15.0f, 21.0f, 6.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _zoomOutMap = build;
        build.getClass();
        return build;
    }
}
