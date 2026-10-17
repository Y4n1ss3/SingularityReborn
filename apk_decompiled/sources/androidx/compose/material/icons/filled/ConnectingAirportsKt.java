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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConnectingAirportsKt {
    private static ImageVector _connectingAirports;

    public static final ImageVector getConnectingAirports(Icons.Filled filled) {
        ImageVector imageVector = _connectingAirports;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ConnectingAirports", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(15.4f, 17.0f, 1.3f, 4.4f, -1.1f);
        b.lineTo(13.0f, 17.0f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        kf0.B(b, 3.0f, 2.6f, -4.4f, 1.1f);
        b.lineTo(15.4f, 15.0f);
        uo.n(b, 2.85f, 19.0f, 14.0f, 1.0f);
        b.lineToRelative(-0.6f, 2.0f);
        b.lineToRelative(0.6f, 2.0f);
        uf.A(b, -1.0f, -0.75f, -1.0f, 15.4f);
        b.moveTo(5.75f, 7.0f);
        b.lineTo(5.0f, 6.0f);
        b.horizontalLineTo(4.0f);
        b.lineToRelative(0.6f, 2.0f);
        b.lineTo(4.0f, 10.0f);
        r6.t(b, 1.0f, 0.75f, -1.0f, 8.6f);
        b.lineToRelative(-1.3f, 4.4f);
        uo.n(b, 1.1f, 11.0f, 9.0f, 3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        kf0.A(b, -3.0f, 8.4f, 2.6f, 7.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(b, 8.6f, 7.0f, 5.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectingAirports = build;
        build.getClass();
        return build;
    }
}
