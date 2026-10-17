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
import defpackage.er;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RedoKt {
    private static ImageVector _redo;

    public static final ImageVector getRedo(Icons.Filled filled) {
        ImageVector imageVector = _redo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Redo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.4f, 10.6f);
        b.curveTo(16.55f, 8.99f, 14.15f, 8.0f, 11.5f, 8.0f);
        b.curveToRelative(-4.65f, 0.0f, -8.58f, 3.03f, -9.96f, 7.22f);
        b.lineTo(3.9f, 16.0f);
        b.curveToRelative(1.05f, -3.19f, 4.05f, -5.5f, 7.6f, -5.5f);
        b.curveToRelative(1.95f, 0.0f, 3.73f, 0.72f, 5.12f, 1.88f);
        kf0.y(b, 13.0f, 16.0f, 9.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -3.6f, 3.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _redo = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getRedo$annotations(Icons.Filled filled) {
    }
}
