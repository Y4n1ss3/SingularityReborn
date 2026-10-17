package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.RenderIntent;
import defpackage.dq;
import defpackage.h10;
import defpackage.na0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConnectorKt {
    private static final na0 Connectors;

    static {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        int id$ui_graphics = colorSpaces.getSrgb().getId$ui_graphics();
        int id$ui_graphics2 = colorSpaces.getSrgb().getId$ui_graphics();
        RenderIntent.Companion companion = RenderIntent.Companion;
        int m5219getPerceptualuksYyKA = id$ui_graphics | (id$ui_graphics2 << 6) | (companion.m5219getPerceptualuksYyKA() << 12);
        Connector identity$ui_graphics = Connector.Companion.identity$ui_graphics(colorSpaces.getSrgb());
        int id$ui_graphics3 = colorSpaces.getSrgb().getId$ui_graphics() | (colorSpaces.getOklab().getId$ui_graphics() << 6) | (companion.m5219getPerceptualuksYyKA() << 12);
        dq dqVar = null;
        Connector connector = new Connector(colorSpaces.getSrgb(), colorSpaces.getOklab(), companion.m5219getPerceptualuksYyKA(), dqVar);
        int id$ui_graphics4 = colorSpaces.getOklab().getId$ui_graphics() | (colorSpaces.getSrgb().getId$ui_graphics() << 6) | (companion.m5219getPerceptualuksYyKA() << 12);
        Connector connector2 = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion.m5219getPerceptualuksYyKA(), dqVar);
        na0 na0Var = h10.a;
        na0 na0Var2 = new na0();
        na0Var2.i(m5219getPerceptualuksYyKA, identity$ui_graphics);
        na0Var2.i(id$ui_graphics3, connector);
        na0Var2.i(id$ui_graphics4, connector2);
        Connectors = na0Var2;
    }

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m5210connectorKeyYBCOT_4(int i, int i2, int i3) {
        return i | (i2 << 6) | (i3 << 12);
    }

    public static final na0 getConnectors() {
        return Connectors;
    }
}
