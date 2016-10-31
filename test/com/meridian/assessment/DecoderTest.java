package com.meridian.assessment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoderTest {

	@Test
	public void Decode_ShouldReturnCorrectDecodedMessage() {
		assertEquals(
				"*CDC is the trademark of the Control Data Corporation.",
				Decoder.Decode("1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5"));
		assertEquals(
				"*IBM is a trademark of the International Business Machine Corporation.",
				Decoder.Decode("1PIT'pz'h'{yhklthyr'vm'{ol'Pu{lyuh{pvuhs'I|zpulzz'Thjopul'Jvywvyh{pvu5"));
		assertEquals(
				"*DEC is the trademark of the Digital Equipment Corporation.",
				Decoder.Decode("1KLJ'pz'{ol'{yhklthyr'vm'{ol'Kpnp{hs'Lx|pwtlu{'Jvywvyh{pvu5"));
	}

}
