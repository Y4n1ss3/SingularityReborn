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
import defpackage.af0;
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalLaundryServiceKt {
    private static ImageVector _localLaundryService;

    public static final ImageVector getLocalLaundryService(Icons.Sharp sharp) {
        ImageVector imageVector = _localLaundryService;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LocalLaundryService", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.17f, 16.83f);
        b.curveToRelative(1.56f, 1.56f, 4.1f, 1.56f, 5.66f, 0.0f);
        b.reflectiveCurveToRelative(1.56f, -4.1f, 0.0f, -5.66f);
        fc.B(b, -5.66f, 5.66f, 20.0f, 2.01f);
        af0.m(b, 4.0f, 2.0f, 20.0f, 16.0f);
        uo.l(b, 20.0f, 2.01f, 10.0f, 4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.close();
        b.moveTo(7.0f, 4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLaundryService = build;
        build.getClass();
        return build;
    }
}
